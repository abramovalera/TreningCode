package HW.LastTask.task1;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class EntityManager<T extends Entity> {
    private CopyOnWriteArrayList<T> entities = new CopyOnWriteArrayList<>();

    private void add(T entity) {
        entities.add(entity);
    }

    private boolean remove(T entity) {
        return entities.remove(entity);
    }

    public List<T> getAll() {
        return List.copyOf(entities);
    }

    public List<T> filterByAge(int min, int max) {
        return entities.stream().filter(entity -> entity.getAge() >= min && entity.getAge() <= max)
                .collect(Collectors.toList());
    }

    public List<T> filterByName(String name) {
        return entities.stream().filter(entity -> entity.getName().equals(name))
                .collect(Collectors.toList());

    }

    public List<T> filterByActive(boolean isActive){
        return entities.stream().filter(entity -> entity.isActive())
                .collect(Collectors.toList());

    }


}
