package com.snippets.designpatterns.creational.prototype;

import java.util.HashMap;
import java.util.Map;


/**
 * Represents a container for Resource instances that will always provide a new copy of the instance.
 * Can be used with polymorphism to hold different types of objects. Or directly with Object types.
 * Useful for pre configured objects.
 */
public class PrototypeRegistry {

    private static final PrototypeRegistry instance = new PrototypeRegistry();

    private Map<String, Resource> registry = new HashMap<>();

    // singleton class
    private PrototypeRegistry() {
    }

    /**
     * Get instance of Singleton Class
     * @return PrototypeRegistry instance
     */
    public static PrototypeRegistry getInstance() {
        return instance;
    }



    /**
     * Returns a copy of the resource in the registry using 'clone'
     *
     * @param name the stateName of the resource
     * @return the cloned resource
     */
    public Resource getByClone(String name) {
        return registry.get(name).clone();
    }



    /**
     * Returns a copy of the resource in the registry using 'copy'
     *
     * @param name the stateName of the resource
     * @return the copied resource
     */
    public Resource getByCopy(String name) {
        return new Resource(registry.get(name));
    }


    /**
     * register a new resource.
     *
     * @param name stateName of resource
     * @param resource the resource to register
     */
    public void register(String name, Resource resource) {
        registry.put(name, resource);
    }
}
