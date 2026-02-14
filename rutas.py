import os

def listar_todo(ruta_inicial):
    for root, dirs, files in os.walk(ruta_inicial):
        # Imprimir directorio actual
        print(f"\n[DIR] {root}")
        
        # Imprimir subdirectorios
        for dir_name in dirs:
            print(f"  [DIR]  {os.path.join(root, dir_name)}")
        
        # Imprimir archivos
        for file_name in files:
            print(f"  [FILE] {os.path.join(root, file_name)}")

# Usar la ruta directamente
listar_todo("C:/repo/ies-sistema")
# o también funciona:
# listar_todo(r"C:\repo")  # La 'r' hace que sea una cadena raw