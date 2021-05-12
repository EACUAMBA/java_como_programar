/*
 * Author: Edilson Alexandre Cuamba
 * Data: 5/12/2021
 */
public enum Book {

    CPJ("como programar em java?", "2015"),
    CPCSHARP("Como programar em C#?","2016"),
    CUS("Como usar Spring?", "2006"),
    CUH("Como sar Hibernate?","1997"),
    CPUNB("Como programar usando NetBeans?", "2019");



    private final String titulo;
    private final String anoDeLancamento;

    Book(String titulo, String anoDeLancamento){
        this.titulo = titulo;
        this.anoDeLancamento = anoDeLancamento;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public String getAnoDeLancamento(){
        return this.anoDeLancamento;
    }
}
