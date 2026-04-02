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

        // Mejora
        public static async Task<T> GetAsync<T>(string endpoint)
        {
            SetToken();

            var response = await client.GetAsync(endpoint);
            await ValidarRespuesta(response);

            var json = await response.Content.ReadAsStringAsync();

            return JsonSerializer.Deserialize<T>(json,
                new JsonSerializerOptions { PropertyNameCaseInsensitive = true });
        }

        public static async Task PostAsync<T>(string endpoint, T data)
        {
            SetToken();

            var json = JsonSerializer.Serialize(data);
            var content = new StringContent(json, Encoding.UTF8, "application/json");

            var response = await client.PostAsync(endpoint, content);
            await ValidarRespuesta(response);
        }

        public static async Task PutAsync<T>(string endpoint, T data)
        {
            SetToken();

            var json = JsonSerializer.Serialize(data);
            var content = new StringContent(json, Encoding.UTF8, "application/json");

            var response = await client.PutAsync(endpoint, content);
            await ValidarRespuesta(response);
        }

        public static async Task DeleteAsync(string endpoint)
        {
            SetToken();

            var response = await client.DeleteAsync(endpoint);
            await ValidarRespuesta(response);
        }

        private static async Task ValidarRespuesta(HttpResponseMessage response)
        {
            if (!response.IsSuccessStatusCode)
            {
                var mensaje = await response.Content.ReadAsStringAsync();
                throw new Exception($"Error HTTP {(int)response.StatusCode}: {mensaje}");
            }
        }
    }
}
