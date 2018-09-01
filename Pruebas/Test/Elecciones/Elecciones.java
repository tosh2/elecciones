package test.Elecciones;
public class Elecciones {

    public Elecciones() {
    }




    public String getCandidato(String nombre) {
        String response="{\"nombre\":\""+nombre+"\"}";
        return response;
    }

    static public void main(String[] args){
      Elecciones e=new Elecciones();
      
      System.out.println("Resultado: " + e.getCandidato("Jose") + "");
   }
    

}
