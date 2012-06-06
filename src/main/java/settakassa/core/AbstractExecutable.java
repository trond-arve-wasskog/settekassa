package settakassa.core;

public abstract class AbstractExecutable implements Executable {

   public void execute(EntityId id) {
      beforeExecute(id);
      doExecute(id);
      afterExecute(id);
   }

   protected abstract void beforeExecute(EntityId id);
   protected abstract void doExecute(EntityId id);
   protected abstract void afterExecute(EntityId id);
}
