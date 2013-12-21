package com.snippets.designpatterns;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Set<Entity> s = new HashSet<>();

        s.add(new Entity(4));
        s.add(new Entity(4));

        System.out.println(s);

        Map<Entity, Integer> m = new HashMap<>();
        m.put(new Entity(3), 3);
        m.put(new Entity(3), 4);

        System.out.println(m);
    }


    static class Entity {
        private int a;

        public Entity(int a) {
            this.a = a;
        }

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (o == null || getClass() != o.getClass()) return false;
//            Entity entity = (Entity) o;
//            return a == entity.a;
//        }

        @Override
        public int hashCode() {
            return Objects.hash(a);
        }


//        @Override
//        public String toString() {
//            final StringBuffer sb = new StringBuffer("Entity{");
//            sb.append("a=").append(a);
//            sb.append('}');
//            return sb.toString();
//        }
    }
}
