# 🏥 Validación de Historias de Usuario Clínicas con Cucumber y BDD

Este proyecto consiste en la **automatización de pruebas funcionales** para un sistema de gestión clínica, aplicando **BDD (Behavior Driven Development)** con **Java, Selenium WebDriver, Cucumber y Maven**.  

Se validan flujos críticos como el **inicio de sesión de médicos**, la **carga de fichas clínicas** y la **validación de reglas de negocio** mediante escenarios escritos en **Gherkin** y ejecutados con **Cucumber**.  

---

## 🎯 Objetivo

- Diseñar e implementar un framework de automatización con **Java + Cucumber + Selenium**.  
- Aplicar **BDD** mediante historias de usuario redactadas en Gherkin.  
- Validar funcionalidades críticas de un sistema clínico: login, fichas clínicas y reglas de negocio.  
- Implementar **Page Object Model (POM)** y **WebDriverManager** como buenas prácticas.  
- Generar reportes de ejecución en **HTML/JSON**.  

---

## 🚀 Requerimientos Funcionales

### Historia de Usuario 1 – Inicio de sesión de médico
- Validar login con credenciales válidas.  
- Validar mensaje de error con credenciales inválidas.  

### Historia de Usuario 2 – Carga de ficha clínica
- Ingresar **nombre, diagnóstico, edad y tratamiento**.  
- Mostrar mensaje de confirmación al guardar.  

### Historia de Usuario 3 – Validación de reglas clínicas
- Si la **edad < 12**, el diagnóstico debe ser **“Pediátrico”**.  
- Si no se completa el **tratamiento**, no se puede guardar la ficha.  

---

## 📂 Estructura del Proyecto

```bash
ClinicaBDD/
│
├── src/test/java/com/clinica/
│   ├── runners/       # Clases Runner de Cucumber
│   ├── steps/         # Step Definitions
│   ├── pages/         # Page Objects
│   └── hooks/         # Hooks de inicialización/cierre
│
├── src/test/resources/features/
│   ├── login.feature
│   ├── ficha.feature
│   └── reglas.feature
│
├── pom.xml
└── README.md
