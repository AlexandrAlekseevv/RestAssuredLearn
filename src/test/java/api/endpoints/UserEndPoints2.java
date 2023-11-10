package api.endpoints;


import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.ResourceBundle;

import static io.restassured.RestAssured.given;

//Created for perform Create Read Update Delete (CRUD) requests to the user API
public class UserEndPoints2 {


    static ResourceBundle getUrl() {

        ResourceBundle resourceBundle =  ResourceBundle.getBundle("routes");
        return resourceBundle;
    }

    public static Response createUser(User payload){

    String post_user = getUrl().getString("post_url");
        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(payload)
        .when()
                .post(post_user);
        return response;
    }
    public static Response readUser(String username){

        String get_user = getUrl().getString("get_url");

        Response response = given()
                .pathParam("username",username)
        .when()
                .get(get_user);
        return response;
    }

    public static Response updateUser(String username, User payload){

        String read_user = getUrl().getString("put_url");

        Response response = given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .pathParam("username",username)
                .body(payload)
        .when()
                .put(read_user);
        return response;
    }

public static Response deleteUser(String username){

    String delete_user = getUrl().getString("delete_url");

        Response response = given()
                .pathParam("username",username)
        .when()
                .delete(delete_user);
        return response;
    }



}
