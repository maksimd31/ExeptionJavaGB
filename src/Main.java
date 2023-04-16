public class Main {
    public static void main(String[] args) {

        try (Counter counter = new Counter()) {
            counter.add();
            counter.add();
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
    public static class Counter implements AutoCloseable {
        private int count;
        private boolean isClosed;

        public Counter() {
            this.count = 0;
            this.isClosed = false;
        }

        public void add() {
            if(isClosed){
                throw new IllegalStateException("Счетчик закрыт");
            }
            count++;
        }

        @Override
        public void close() throws Exception {
            if(!isClosed){
                isClosed = true;
            }else {
                throw new IllegalStateException("Счетчик уже закрыт");
            }
        }
    }

}