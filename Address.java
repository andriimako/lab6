public class Address {
    private String country, city, postalCode, street, apartment;

    public String createAddress (String country){
        this.country = country;

        return String.format("the country is %s", country);
    }

    public String createAddress (String country, String city){
        this.country = country;
        this.city = city;

        return String.format("the country is %s", country, " the city is %s", city);
    }

    public String createAddress (String country, String city,String postalCode){
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
        return String.format("the country is %s", country, " the city is %s", city,
                " the postal code is %s",postalCode);
    }
    public String createAddress (String country, String city,String postalCode,
                       String street){
        this.country = country;
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;

        return String.format("the country is %s", country, " the city is %s", city, " the postal code is %s",postalCode,
                " the street name %s",street);
    }



    public String createAddress (String country, String city,String postalCode,
                  String street, String apartment){

       this.country = country;
       this.city = city;
       this.postalCode = postalCode;
       this.street = street;
       this.apartment = apartment;

       return String.format("the country is %s", country, " the city is %s", city, " the postal code is %s",postalCode,
               " the street name %s",street," the apartment is%s",apartment);

   }
}
