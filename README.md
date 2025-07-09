# 🛠️ TallerApp - Sistema de Gestión para Taller Mecánico

**TallerApp** es una aplicación de escritorio desarrollada en **Java con Swing/NetBeans** que implementa un sistema completo de gestión para talleres mecánicos. Utiliza **MySQL** como base de datos principal y genera facturas en formato **JSON**.

---

## 🚀 Características Principales

### 📋 Gestión Completa CRUD
- **👤 Usuarios/Empleados**: Sistema de login y registro de empleados
- **🚗 Clientes**: Administración completa de información de clientes
- **🔧 Repuestos**: Control de inventario con marca, cantidad y precios
- **📊 Ventas**: Registro detallado de servicios y ventas realizadas

### 💼 Funcionalidades Avanzadas
- **Sistema de Autenticación**: Login seguro con validación de usuarios
- **Generación de Facturas**: Exportación automática en formato JSON
- **Gestión de Vehículos**: Registro de placas, modelo, marca, cilindraje y color
- **Control de Reparaciones**: Catálogo de servicios con precios
- **Búsqueda Inteligente**: Filtros por ID, cliente, placa, etc.
- **Interfaz Gráfica Moderna**: Diseño intuitivo con fuentes personalizadas (Poppins)

### 🔄 Operaciones CRUD Disponibles
- **Crear**: Nuevos registros de clientes, repuestos y ventas
- **Leer**: Visualización y búsqueda de información
- **Actualizar**: Modificación de datos existentes
- **Eliminar**: Borrado seguro de registros

---

## 🏗️ Arquitectura del Sistema

### 📁 Estructura del Proyecto
```
src/
├── proyectoprogramacion/
│   ├── Menu.java              # Menú principal del sistema
│   ├── llenarJson.java        # Generador de facturas JSON
│   ├── ObtenerNombre.java     # Gestión de sesiones de usuario
│   ├── Procesos.java          # Lógica de procesos del negocio
│   ├── TextPrompt.java        # Placeholders para campos de texto
│   ├── VentanaRegistro.java   # Registro de nuevos usuarios
│   └── ventanas/
│       ├── VentanaCliente.java      # CRUD de clientes
│       ├── VentanaRepuestos.java    # CRUD de repuestos
│       ├── VentanaVentas.java       # Visualización de ventas
│       ├── VentanaGenerarVentas.java # Creación de nuevas ventas
│       └── VentanaFactura.java      # Generación de facturas
└── vista/
    └── VentanaLogin.java      # Sistema de autenticación
```

### 🗄️ Base de Datos
- **customers**: Información de clientes (ID, nombre, apellido, identificación, teléfono)
- **parts**: Catálogo de repuestos (ID, descripción, cantidad, costo, marca)
- **repairs**: Servicios de reparación (ID, descripción, costo)
- **sales**: Registro de ventas (cliente, vehículo, repuestos, reparaciones, fecha, total)
- **users**: Usuarios del sistema (empleados con acceso)

---

## 🛠️ Tecnologías Utilizadas

- **☕ Java SE**: Lenguaje de programación principal
- **🎨 Swing**: Framework para interfaz gráfica de usuario
- **🔧 NetBeans**: IDE de desarrollo
- **🗃️ MySQL**: Sistema de gestión de base de datos
- **📦 XAMPP**: Servidor local para MySQL
- **📄 JSON**: Formato para facturas exportadas
- **🎯 JDBC**: Conectividad con base de datos

### 📚 Dependencias
- `mysql-connector-j-8.0.31.jar` - Driver MySQL
- `jcalendar-1.4.jar` - Selector de fechas
- `gson-2.2.2.jar` - Procesamiento JSON

---

## ⚙️ Configuración y Ejecución

### � Requisitos Previos
1. **Java Development Kit (JDK) 8+**
2. **NetBeans IDE** (recomendado)
3. **XAMPP** o servidor MySQL local
4. **MySQL Workbench** (opcional para gestión de BD)

### 🚀 Instalación

1. **Clonar el repositorio**
   ```bash
   git clone <url-del-repositorio>
   cd Taller-Mecanico-CRUD
   ```

2. **Configurar Base de Datos**
   - Iniciar XAMPP y activar MySQL
   - Importar el archivo `datos_taller.sql` en phpMyAdmin
   - Verificar que la base de datos `datos_taller` esté creada

3. **Configurar Conexión**
   ```java
   // En Menu.java, verificar parámetros de conexión:
   String url = "jdbc:mysql://localhost/";
   String nombreBase = "datos_taller";
   String usuario = "root";
   String password = "";
   ```

4. **Ejecutar Aplicación**
   - Abrir proyecto en NetBeans
   - Compilar y ejecutar `VentanaLogin.java`
   - Usar credenciales de usuario existente o registrar nuevo usuario

---

## � Capturas de Pantalla

### 🔐 Sistema de Login
- Autenticación segura con validación de credenciales
- Registro de nuevos usuarios empleados
- Diseño moderno con fuente Poppins personalizada

### 🏠 Menú Principal
- Acceso rápido a todas las funcionalidades
- Navegación intuitiva entre módulos
- Información de usuario logueado

### 👥 Gestión de Clientes
- Formulario completo de datos del cliente
- Búsqueda por ID con autocompletado
- Operaciones CRUD con validaciones

### � Control de Repuestos
- Inventario detallado con marca y precios
- Gestión de stock y costos unitarios
- Búsqueda y filtrado avanzado

### 💰 Registro de Ventas
- Formulario completo de venta con vehículo
- Selección de repuestos y reparaciones
- Cálculo automático de totales
- Generación de facturas en JSON

---

## 🔧 Funcionalidades Detalladas

### 🔍 Sistema de Búsqueda
- Búsqueda por múltiples criterios (ID, nombre, placa)
- Autocompletado en formularios
- Filtros en tiempo real

### 💾 Persistencia de Datos
- Conexión robusta con MySQL
- Manejo de excepciones SQL
- Transacciones seguras

### 📊 Reportes y Facturas
- Generación automática de facturas JSON
- Contador incremental de facturas
- Estructura detallada con datos completos

### 🎨 Interfaz de Usuario
- Diseño responsivo y profesional
- Iconografía personalizada
- Validaciones en tiempo real
- Mensajes informativos de estado

---