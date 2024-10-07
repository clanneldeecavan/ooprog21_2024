public class BloodData 
{
    private String bloodType;
    private String rhFactor;

    public BloodData() {
        defaultPatient();
    }

    public BloodData(String bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }

    public void defaultPatient() {
        this.bloodType = "A";
        this.rhFactor = "-";
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setRhFactor(String rhFactor) {
        this.rhFactor = rhFactor;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void displayBloodInfo() {
        System.out.println("Your blood type is: " + bloodType);
        System.out.println("Your Rh Factor is: " + rhFactor);
    }
}
