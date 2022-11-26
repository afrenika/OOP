package tr0;

class UserFactory {
    public static People create(String type) throws Exception {
        if ("user".equals(type)) {
            return new User();
        } else if ("customer".equals(type)) {
            return new Customer();
        } else if ("admin".equals(type)) {
            return new Admin();
        }
        throw new Exception("Wrong user type passed.");
    }
}

interface People{

}
class User implements People{

}
class Customer implements People{

}
class Admin implements People{ }

