# import the py4j library
from py4j.java_gateway import JavaGateway

# create the Java Gateway
gateway = JavaGateway()

# instantiate a stack and queue
my_queue = gateway.entry_point.getQueue()
my_stack = gateway.entry_point.getStack()

# Add Items to the queue
my_queue.enqueue("sentence.");
my_queue.enqueue("backwards");
my_queue.enqueue("a");
my_queue.enqueue("was");
my_queue.enqueue("This");

# Move queue contents to stack
while not my_queue.isEmpty():
    my_stack.push(my_queue.dequeue());

# Print out contents of stack
while not my_stack.isEmpty():
    print(my_stack.pop(), end=" ")