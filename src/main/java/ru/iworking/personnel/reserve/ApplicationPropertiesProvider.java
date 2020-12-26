package ru.iworking.personnel.reserve;

public interface ApplicationPropertiesProvider {
    String getValueByName(String name);
    void saveValue(String name, String value);
}
