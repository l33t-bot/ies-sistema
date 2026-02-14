using ies.WinForms.Models;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Text;
using System.Text.Json;
using System.Threading.Tasks;

namespace ies.WinForms.Api
{
    public class ApiPlan
    {
        private readonly HttpClient client;

        public ApiPlan()
        {
            ApiClient.SetToken();
            client = ApiClient.Http;
        }

        // GET /api/planes
        public async Task<List<PlanDto>> GetAll()
        {
            var res = await client.GetAsync("/api/planes");
            res.EnsureSuccessStatusCode();

            var json = await res.Content.ReadAsStringAsync();

            return JsonSerializer.Deserialize<List<PlanDto>>(
                json,
                new JsonSerializerOptions { PropertyNameCaseInsensitive = true }
            );
        }

        // GET /api/planes/carrera/{id}
        public async Task<List<PlanDto>> GetByCarrera(long idCarrera)
        {
            var res = await client.GetAsync($"/api/planes/carrera/{idCarrera}");
            res.EnsureSuccessStatusCode();

            var json = await res.Content.ReadAsStringAsync();

            return JsonSerializer.Deserialize<List<PlanDto>>(
                json,
                new JsonSerializerOptions { PropertyNameCaseInsensitive = true }
            );
        }

        // POST / PUT
        public async Task Save(PlanDto plan)
        {
            var json = JsonSerializer.Serialize(plan);
            var content = new StringContent(json, Encoding.UTF8, "application/json");

            HttpResponseMessage res; // response - respuesta

            res = plan.idPlan == null
                ? await client.PostAsync("/api/planes", content)
                : await client.PutAsync($"/api/planes/{plan.idPlan}", content);

            //res.EnsureSuccessStatusCode();

            if (!res.IsSuccessStatusCode)
            {
                var error = await res.Content.ReadAsStringAsync();
                throw new Exception($"Status: {res.StatusCode}\n{error}");
            }
        }

        // DELETE
        public async Task Delete(long idplan)
        {
            var res = await client.DeleteAsync($"/api/planes/{idplan}");
            res.EnsureSuccessStatusCode();
        }
    }
}
