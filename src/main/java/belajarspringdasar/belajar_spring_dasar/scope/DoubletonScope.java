package belajarspringdasar.belajar_spring_dasar.scope;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class DoubletonScope implements Scope {
    private List<Object> objects = new ArrayList<>(2);

    private Long counter = 1L;

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        counter++;

        if (objects.size() == 2) {
            return objects.get((int) (counter % 2));
        } else {
            Object object = objectFactory.getObject();
            objects.add(object);
            return object;
        }
    }

    @Override
    public Object remove(String name) {
        if (objects.size() != 0) {
            return objects.remove(0);
        }

        return null;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'registerDestructionCallback'");
    }

    @Override
    public Object resolveContextualObject(String key) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'resolveContextualObject'");
    }

    @Override
    public String getConversationId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getConversationId'");
    }

}
