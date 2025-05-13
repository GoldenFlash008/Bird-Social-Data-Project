public class Birds {

  private int position; //index position
  private String namesSearch; // argument for names
  private String colorSearch; //argument for colors
  private String dietSearch; //argument for diets
  public static BirdieInfo[] birdData;
  public static String[] dietsData;
  public static String[] colorsData;
  public static String[] statusData;
  public static String[] namesData;
  public static int ommittedResults = 0;


  public Birds(String namesFile, String statusFile, String colorsFile, String dietsFile) {
    birdData = createBird(namesFile, statusFile, colorsFile, dietsFile);
    }

    public BirdieInfo[] createBird(String namesFile, String statusFile, String colorsFile, String dietsFile){ //constructor array using format from BirdieInfo called createBird
      //names variable from BirdieInfo is namesFile status variable from BirdieInfo is statusFile etc.
    
      String[] namesData = FileReader.toStringArray(namesFile); //namesData is variable for names.txt file to read file
      String[] statusData = FileReader.toStringArray(statusFile);
      String[] colorsData = FileReader.toStringArray(colorsFile);
      String[] dietsData = FileReader.toStringArray(dietsFile);
      BirdieInfo[] tempAnswers = new BirdieInfo[namesData.length]; // new BirdieInfo array called tempAnswers
      this.dietsData = dietsData;
      this.colorsData = colorsData;
      this.statusData = statusData;
      this.namesData = namesData;
    
      for (int index = 0; index < tempAnswers.length; index++) {
        tempAnswers[index] = new BirdieInfo(namesData[index], statusData[index], colorsData[index], dietsData[index]); //traverses and prints name status color and diet
      }
    return tempAnswers;
  }


    public BirdieInfo[] getBirdieInfo() {
      return birdData;
  }
  
  public void printBirdieInfo() {
    BirdieInfo[] getInformation = this.getBirdieInfo(); // new array

    for (int index = 0; index < getInformation.length; index++) {
      System.out.println(getInformation[index].toString());
}
}
  
//  public String inquiryAnswer(int position) {
    //this.position = position;
    //return data[position].toString(); //uses toString method to get information from data
 // }
  
  public static BirdieInfo[] inquiryAnswer(String search) { //method to return string
    
    BirdieInfo[] results = new BirdieInfo[birdData.length];
    
    for (int index = 0; index < birdData.length; index++) {

      if (dietsData[index].equals(search)) { //compares if data at index is the same as argument

        results[index]=birdData[index];
        System.out.println(birdData[index].toString());
        }
         if(!(dietsData[index].equals(search))) {
                  ommittedResults++;
        }
      }
        return results;
  }

  public static BirdieInfo[] inquiryAnswerColor(String search) {

    BirdieInfo[] resultsColor = new BirdieInfo[birdData.length];
  
  for (int index = 0; index < birdData.length; index++) {
    
      if (colorsData[index].equals(search)) { //compares if data at index is the same as argument
        
        resultsColor[index]=birdData[index];
        System.out.println(birdData[index].toString());
        }
   if(!(colorsData[index].equals(search))) {
                  ommittedResults++;
        }
      }
        return resultsColor;
    }

  public static BirdieInfo[] inquiryAnswerStatus(String search) {

    BirdieInfo[] resultsStatus = new BirdieInfo[birdData.length];
  
  for (int index = 0; index < birdData.length; index++) {
    
      if (statusData[index].equals(search)) { //compares if data at index is the same as argument
        
        resultsStatus[index]=birdData[index];
        System.out.println(birdData[index].toString());
        }
   if(!(statusData[index].equals(search))) {
                  ommittedResults++;
        }
      }
        return resultsStatus;
    }

  public static BirdieInfo[] inquiryAnswerName(String search) {

    BirdieInfo[] resultsName = new BirdieInfo[birdData.length];
  
  for (int index = 0; index < birdData.length; index++) {
    
      if (namesData[index].equals(search)) { //compares if data at index is the same as argument
        
        resultsName[index]=birdData[index];
        System.out.println(birdData[index].toString());
        }
   if(!(namesData[index].equals(search))) {
                  ommittedResults++;
      }
  }
        return resultsName;
    }
  
  }



    



//if (info.genres().equalsIgnoreCase(genre))
//  results

