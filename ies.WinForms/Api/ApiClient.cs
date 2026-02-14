using ies.WinForms.Models;
using ies.WinForms.Utils;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Net.Http;
using System.Net.Http.Headers;
using System.Runtime.InteropServices;
using System.Text;
using System.Text.Json;
using System.Threading.Tasks;

namespace ies.WinForms.Api
{
    public class ApiClient
    {
        private static readonly HttpClient client = new HttpClient
        {
            BaseAddress = new Uri("http://localhost:8080")
        };

        public static HttpClient Http => client;
        public static string Token { get; private set; }

        public static void SetToken()
        {
            if (!string.IsNullOrEmpty(Session.Token))
            {
                client.DefaultRequestHeaders.Authorization =
                    new AuthenticationHeaderValue("Bearer", Session.Token);
            }
        }

        public static async Task<LoginResponse> LoginAsync(LoginRequest request)
        {
            var json = JsonSerializer.Serialize(request);
            var content = new StringContent(json, Encoding.UTF8, "application/json");

            var response = await client.PostAsync("/api/auth/login", content);

            if (!response.IsSuccessStatusCode)
                throw new Exception("Usuario o contraseña incorrectos");

            var responseJson = await response.Content.ReadAsStringAsync();

            var loginResponse = JsonSerializer.Deserialize<LoginResponse>(
                responseJson,
                new JsonSerializerOptions { PropertyNameCaseInsensitive = true }
            );

            Token = loginResponse.token;

            client.DefaultRequestHeaders.Authorization =
                new AuthenticationHeaderValue("Bearer", Token);

            return loginResponse;
        }
    }
}
