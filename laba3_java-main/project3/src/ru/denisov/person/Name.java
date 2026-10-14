//FIXME
//методы паскалькейс
//cначала private, потом protected, потом public
//понятные переменные
//package ru.denisov.person;
//
//public class Name {
//    private String lastName;
//    private String firstName;
//    private String middleName;
//
//    public Name(String firstName) {
//        this(null, firstName, null);
//    }
//
//    public Name(String lastName, String firstName) {
//        this(lastName, firstName, null);
//    }
//
//    public Name(String lastName, String firstName, String middleName) {
//        this.lastName = sanitize(lastName);
//        this.firstName = sanitize(firstName);
//        this.middleName = sanitize(middleName);
//    }
//
//    private String sanitize(String s) {
//        if (s == null) return null;
//        String t = s.trim();
//        return t.isEmpty() ? null : t;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public String getMiddleName() {
//        return middleName;
//    }
//
//    @Override
//    public String toString() {
//        StringBuilder sb = new StringBuilder();
//        if (lastName != null) sb.append(lastName);
//        if (firstName != null) {
//            if (sb.length() > 0) sb.append(" ");
//            sb.append(firstName);
//        }
//        if (middleName != null) {
//            if (sb.length() > 0) sb.append(" ");
//            sb.append(middleName);
//        }
//        return sb.length() == 0 ? "(без имени)" : sb.toString();
//    }
//}

//FIXDO:
package ru.denisov.person;

public class Name {
    private String lastName;
    private String firstName;
    private String middleName;

    public Name(String firstName) {
        this(null, firstName, null);
    }

    public Name(String lastName, String firstName) {
        this(lastName, firstName, null);
    }

    public Name(String lastName, String firstName, String middleName) {
        this.lastName = Sanitize(lastName);
        this.firstName = Sanitize(firstName);
        this.middleName = Sanitize(middleName);
    }

    public String GetLastName() {
        return lastName;
    }

    public String GetFirstName() {
        return firstName;
    }

    public String GetMiddleName() {
        return middleName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (lastName != null) sb.append(lastName);
        if (firstName != null) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(firstName);
        }
        if (middleName != null) {
            if (sb.length() > 0) sb.append(" ");
            sb.append(middleName);
        }
        return sb.length() == 0 ? "(без имени)" : sb.toString();
    }

    private String Sanitize(String value) {
        if (value == null) {
            return null;
        }
        String trimmed = value.trim();
        return trimmed.isEmpty() ? null : trimmed;
    }
}