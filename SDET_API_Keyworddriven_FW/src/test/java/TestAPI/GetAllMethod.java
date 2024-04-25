package TestAPI;
import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
public class GetAllMethod {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Response res=
given()
.contentType(ContentType.JSON)
.when()
.get("http://localhost:3000/APIBatchStudents");
		
		System.out.print(res.statusCode());
		System.out.print(res.asString());
	}

}
