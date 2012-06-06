package settakassa.core;

public abstract class JobbInfoExecutable extends AbstractExecutable {

   private JobbInfo jobbInfo = new JobbInfo();
   
   @Override
   protected void beforeExecute(EntityId id) {
      jobbInfo.addBeforeEvent(id);
   }

   @Override
   protected void afterExecute(EntityId id) {
      jobbInfo.addAfterEvent(id);
   }
}
