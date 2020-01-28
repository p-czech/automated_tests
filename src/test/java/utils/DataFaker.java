package utils;

import com.github.javafaker.Faker;

import java.util.Date;

public class DataFaker {

  private Faker faker;

  public DataFaker() {
    faker = new Faker();
  }

public String getFakeName() {
    return faker.name().firstName();
}

public String getFakeSurname() {
    return faker.name().lastName();
}

public String getFakeEmail() {
    return faker.internet().emailAddress();
}

public String getFakePassword() {
    return faker.internet().password();
}

/* //month selecting to be fixed
public String getFakeBirthDate(String datePart) {
  String date = faker.date().birthday().toString();
  String[] date1 = date.toString().split(" "); //day index 2, month 1, year 5;
  if ("day".equals(datePart)) {
    return String.valueOf(Integer.parseInt(date1[2]));
  } else if ("month".equals(datePart)) {
    return date1[1];
  } else if ("year".equals(datePart)) {
    return date1[5];
  } else {
    return date;
  }
}*/

public String getFakeAddress() {
    return faker.address().streetAddress();
}

public String getFakeCity() {
    return faker.address().city();
}

/*//to specify only 5 digit postcode
public String getFakePostCode() {
  return faker.address().zipCode();
}  */

public String getFakeMobileNumber() {
    return faker.phoneNumber().cellPhone();
}

}
