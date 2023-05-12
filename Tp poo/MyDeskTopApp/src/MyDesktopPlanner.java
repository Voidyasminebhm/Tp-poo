
import java.time.LocalDate;
import java.time.LocalTime;


public class MyDesktopPlanner {
    public static void main(String[] args) throws Exception {
 
       
        Jour jour = new Jour(LocalDate.now(), 3);
        
    
        jour.AjouterCreneau(LocalTime.of(8, 0), LocalTime.of(10, 0), 30);

        Categorie categorie1 = new Categorie("Heealt", "red");
        Prioritee priorite1 = Prioritee.High;

        
        Tache task = new Simple("Faire la vaisselle", "2023-05-13", 30, categorie1, priorite1,1 ,"hello");
       // 
       Tache task2 = new Simple("Task 2", "2023-05-13", 10, categorie1, priorite1,1 ,"task2");
       
       
  jour.AjouterTache(task);
  jour.AjouterTache(task2);
  jour.afficherInfo();
      
        System.out.println(".....................");
       
    }
}
