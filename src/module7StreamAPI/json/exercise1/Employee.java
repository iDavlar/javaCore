package module7StreamAPI.json.exercise1;

import java.util.Arrays;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private boolean permanent;
    private Address address;
    private List<Integer> phoneNumbers;
    private String role;
    private List<String> cities;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Employee{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", permanent=").append(permanent);
        sb.append(", address=").append(address);
        sb.append(", phoneNumbers=").append(phoneNumbers);
        sb.append(", role='").append(role).append('\'');
        sb.append(", cities=").append(cities);
        sb.append('}');
        return sb.toString();
    }

    public boolean isPermanent() {
        return permanent;
    }

    public void setPermanent(boolean permanent) {
        this.permanent = permanent;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public List<Integer> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<Integer> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }
}
