package com.company;

public class Persona {
        protected long dni;
        protected String nombre;
        protected String apellido;
        protected String email;
        protected String direccion;
        protected Persona[] personas;

        public long getDni() {
            return dni;
        }

        public void setDni(long dni) {
            this.dni = dni;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        public Persona (long dni, String nombre, String apellido, String email, String direccion)
        {
            this.dni = dni;
            this.nombre = nombre;
            this.apellido = apellido;
            this.email = email;
            this.direccion = direccion;
        }

        @Override
        public String toString()
        {
            return "DNI: " + this.dni  + "\nNombre y apellido: " + this.nombre + " " + this.apellido + "\nEmail: " + this.email +"\nDirección: " + this.direccion;
        }
}
