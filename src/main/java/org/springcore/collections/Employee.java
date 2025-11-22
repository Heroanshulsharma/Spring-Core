package org.springcore.collections;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employee{
    private String name;
    private List<String> girlfriends;
    private Set<String> friends;
    private Map<String, String> extraMapForDemo;

    public String name() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> girlfriends() {
        return girlfriends;
    }

    public void setGirlfriends(List<String> girlfriends) {
        this.girlfriends = girlfriends;
    }

    public Set<String> friends() {
        return friends;
    }

    public void setFriends(Set<String> friends) {
        this.friends = friends;
    }

    public Map<String, String> extraMapForDemo() {
        return extraMapForDemo;
    }

    public void setExtraMapForDemo(Map<String, String> extraMapForDemo) {
        this.extraMapForDemo = extraMapForDemo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", girlfriends=" + girlfriends +
                ", friends=" + friends +
                ", extraMapForDemo=" + extraMapForDemo +
                '}';
    }

}
