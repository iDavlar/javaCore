package Module2ClassesAndObjects.RegExp;

import java.util.regex.Pattern;

public class ClientValidator {
    private static String EMAIL_MASK = "^[\\w-.]+@\\w{2,6}.(com|ru|net|org)$";
    private static String IP_MASK = "^((2(5[0-5]|[0-4][0-9]))|([0-1]?[0-9]?[0-9])).((2(5[0-5]|[0-4][0-9]))|([0-1]?[0-9]?[0-9])).((2(5[0-5]|[0-4][0-9]))|([0-1]?[0-9]?[0-9])).((2(5[0-5]|[0-4][0-9]))|([0-1]?[0-9]?[0-9]))$";
    private static String URL_MASK = "^(http://|https://)?[\\w-.]+[.][\\w-.]{2,6}(/(\\w+(((/([\\w-.]+/?)*)|([?]([\\w-.]+=[\\w-.]+&?)+))?))?$)?";
    private static String ADDRESS_MASK = "^[А-Я][а-яА-Я]+ обл\\. [А-Я][а-яА-Я]+ р-н [А-Я][а-яА-Я]+ (г\\.|д\\.) [А-Я][а-яА-Я]+ ул\\. [А-Я][а-яА-Я]+ д\\. [0-9]+$";

    public static void validate(Client client) {
        System.out.println("Validating client: " + client);
        System.out.println("Email is correct: " + validateEmail(client.getEmail()));
        System.out.println("Ip is correct: " + validateIP(client.getIp()));
        System.out.println("Url is correct: " + validateUrl(client.getUrl()));
        System.out.println("Address is correct: " + validateAddress(client.getAddress()));
        System.out.println("Validating has been done.");
    }

    public static boolean validateEmail(String email) {
        return Pattern.compile(EMAIL_MASK).matcher(email).matches();
    }

    public static boolean validateIP(String ip) {
        return Pattern.compile(IP_MASK).matcher(ip).matches();
    }

    public static boolean validateUrl(String url) {
        return Pattern.compile(URL_MASK).matcher(url).matches();
    }

    public static boolean validateAddress(String address) {
        return Pattern.compile(ADDRESS_MASK).matcher(
                address.replaceAll("[%$@<>?*()]", "").replaceAll(" +", " ")
        ).matches();
    }
}
