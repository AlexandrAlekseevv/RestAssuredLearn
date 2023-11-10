package api.test;

import api.endpoints.UserEndPoints;
import api.payload.User;
import api.utilites.DataProviders;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DDTest {


    @Test(priority = 1, dataProvider = "Data",dataProviderClass = DataProviders.class)
    public void testPostUser(String userID,String userName,String firstName,String lastName,String userEmail,String pwd ,String phone) {

        User userPayload = new User();

        userPayload.setId(Integer.parseInt(userID));
        userPayload.setUsername(userName);
        userPayload.setFirstName(firstName);
        userPayload.setLastName(lastName);
        userPayload.setEmail(userEmail);
        userPayload.setPassword(pwd);
        userPayload.setPhone(phone);
        Response response = UserEndPoints.createUser(userPayload);
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(),200);
    }

    @Test(priority = 2,dataProvider = "UserNames",dataProviderClass = DataProviders.class)
    public void testUserByName(String userName){
        Response response = UserEndPoints.readUser(userName);
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(),200);

    }



    @Test(priority = 4,dataProvider = "UserNames",dataProviderClass = DataProviders.class)
    public void testDeleteUserByName(String userName){
        Response response = UserEndPoints.deleteUser(userName);
        response.then().log().all();

        Assert.assertEquals(response.getStatusCode(),200);

    }


}
