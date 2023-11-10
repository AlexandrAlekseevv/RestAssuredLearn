package api.endpoints;






/*Create User	Post	https://petstore.swagger.io/v2/user
Get User	    Get 	https://petstore.swagger.io/v2/user/{username}
Update User	    Put 	https://petstore.swagger.io/v2/user/{username}
Get User	    Delete	https://petstore.swagger.io/v2/user/{username}
*/
public class Routes {
    public final static String BASE_URL = "https://petstore.swagger.io/v2";

    public static String post_url = BASE_URL + "/user";
    public static String get_url = BASE_URL + "/user/{username}";
    public static String put_url = BASE_URL + "/user/{username}";
    public static String delete_url = BASE_URL + "/user/{username}";


}
