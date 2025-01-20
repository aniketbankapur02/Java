package tools_public_api_approch_package;

public class money_converter {
    int dollar;
    int ruppies;

   public void dollar_to_ruppies(int dollar) {
        this.dollar = dollar;
        System.out.println(dollar * 80);
    }

    public void ruppies_to_dollar(int ruppies) {
        this.ruppies = ruppies;
        System.out.println(ruppies / 80);
    }
}
