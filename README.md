Repo hecho a partir del repositorio de David Gelpi https://github.com/dfleta/quarkus-active-record-jpa-fk-mappedBy con la intención de aprender a usar quarkus.
A partir de ese repositorio he practicado ManyToOne, OneToMany y además he añadido una tercera tabla con OneToOne.


Para probar la petición de la nueva tabla: curl -w "\n" http://localhost:8080/encargo/1 -v
