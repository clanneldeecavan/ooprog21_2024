public class FirstAddressExcercise 
{
    public static void displayAddress(String street, String city, String state, String country, String company) 
    {
        System.out.println("" + street);
        System.out.println("" + city);
        System.out.println("" + state);
        System.out.println("" + country);
        System.out.println("Company: " + company);
    }

    public static void main(String[] args) {
        displayAddress("129 Samsung-ro, Yeongtong-gu", "Suwon-si", "Gyeonggi-do", "South Korea", "Samsung Electronics Co., Ltd.");
    }
}
