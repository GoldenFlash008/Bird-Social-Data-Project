public class BirdieInfo {

  public String names;
  public String status;
  public String colors;
  public String diets;


  
  public BirdieInfo(String names, String status, String colors, String diets) {
    this.names = names;
    this.status = status;
    this.colors = colors;
    this.diets = diets;
}
  
  public String getNames() {
    return names;
}
  public String getStatus() {
    return status;
  }
  public String getColors() {
    return colors;
  }
  public String getDiets() {
    return diets;
  }
 public String toString() {
    return "Bird Name: " + names + " | Status: " + status + " | Color: " + colors + " | Diet: " + diets;  
}
}
