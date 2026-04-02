using ies.WinForms.Core.Materias;
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
    public class ApiMateria
    {
        private readonly HttpClient client;

        public ApiMateria()
        {
            ApiClient.SetToken();
            client = ApiClient.Http;
        }

        public async Task<List<MateriaDto>> GetAll()
        {
            var res = await client.GetAsync("/apil/materias");
            res.EnsureSuccessStatusCode();

            var json = await res.Content.ReadAsStringAsync();

            return JsonSerializer.Deserialize<List<MateriaDto>>(
                json,
                new JsonSerializerOptions { PropertyNameCaseInsensitive = true }
            );
        }
    }
}
