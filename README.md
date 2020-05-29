# JavaPythonLangLink
Example Project showing Java-Python communication using the Py4j library through an extendable architecture. 


## Architecture
The architecture of this project is quite simple. There is a "manager" class that acts as the gateway between Java and Python and that Gateway is able to return a reference to any java object, allowing for Python to use jvm objects directly.

![-- need fix the diagram --][architecture-diagram]

## Notes
As a consequence of Python being able to have direct references to any jvm object, management of these references are likely to be of concern in bigger projects.

[architecture-diagram]: ./diagrams/Architecture.png "project architecture"
