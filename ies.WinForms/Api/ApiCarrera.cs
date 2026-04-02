using ies.WinForms.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Text;
using System.Text.Json;
using System.Text.Json.Serialization;
using System.Threading.Tasks;

namespace ies.WinForms.Api
{
    public class ApiCarrera
    {
        private readonly HttpClient client;

        public ApiCarrera()
        {
            ApiClient.SetToken();
            client = ApiClient.Http;
        }

        // Esto despues lo puedo poner como una clase, 
        public async Task<List<CarreraDto>> GetAll()
        {
            var res = await client.GetAsync("/api/carreras");
            res.EnsureSuccessStatusCode();

            var json = await res.Content.ReadAsStringAsync();

            return JsonSerializer.Deserialize<List<CarreraDto>>(
                json,
                new JsonSerializerOptions { PropertyNameCaseInsensitive = true }
            );
        }

        // POST / PUT   
        public async Task Save(CarreraDto carrera)
        {
            var json = JsonSerializer.Serialize(carrera);
            var content = new StringContent(json, Encoding.UTF8, "application/json");

            HttpResponseMessage response;

            if (carrera.id_carrera == null)
                response = await client.PostAsync("/api/carreras", content);
            else
                response = await client.PutAsync($"/api/carreras/{carrera.id_carrera}", content);

            response.EnsureSuccessStatusCode();
        }

        public async Task Delete(long id)
        {
            await client.DeleteAsync($"/api/carreras/{id}");
        }
    }
}
