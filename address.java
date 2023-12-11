public class address{ 
    private String street; 
    private int streetNumber; 
    private int buildingNumber; 
    private String city; 
    private String phoneNumber; 
    public address(String street, int streetNumber, int buildingNumber, String city, String phoneNumber){ 
        this.street=street; 
        this.streetNumber=streetNumber; 
        this.buildingNumber=buildingNumber; 
        this.city=city; 
        this.phoneNumber=phoneNumber; 
    } 

    address() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public String getStreet(){ 
        return this.street; 
    } 
    public int getStreetNumber(){ 
        return this.streetNumber; 
    } 
    public int getbuildingNum(){ 
        return this.buildingNumber; 
    } 
    public String getCity(){ 
        return this.city; 
    } 
    public String getPhone(){ 
        return this.phoneNumber; 
    } 
}