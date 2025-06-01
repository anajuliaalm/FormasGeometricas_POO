# 🧮Calculadora de Áreas e Volumes Geométricos 
Este é um projeto desenvolvido em Java com o objetivo de calcular a área de figuras planas e o volume de sólidos geométricos. O código foi estruturado utilizando princípios da Programação Orientada a Objetos (POO) como abstração, encapsulamento e herança.


## 📌FigurasGeometricas – Abstração em Java
Este projeto demonstra o conceito de abstração na Programação Orientada a Objetos (POO), aplicando-o no contexto de figuras geométricas. Ele oculta os detalhes internos da implementação e fornece ao usuário apenas o necessário para uso das formas.

### 🧩 Organização dos Pacotes
br.edu.principal
Contém a classe principal responsável por executar e testar os métodos das figuras.

br.edu.figurasgeometricasplanas
Contém a estrutura das figuras planas, incluindo classes abstratas e implementações concretas para diferentes formas (como círculo, retângulo etc).

### 💡 Conceito Demonstrado
Abstração:
O projeto foca em representar objetos geométricos de forma genérica, permitindo que os detalhes internos de cálculo fiquem encapsulados dentro das classes, enquanto o usuário interage apenas com a interface pública.


## Diagrama de classe UML com Abstração: 

![Image](https://github.com/user-attachments/assets/ef635f2a-7eac-4531-9666-6116f08123ff)


## 🔒FigurasGeometricas – Encapsulamento em Java
Este projeto demonstra o conceito de encapsulamento, um dos pilares da Programação Orientada a Objetos (POO). Ele garante que os dados das figuras geométricas estejam protegidos, permitindo acesso e modificação apenas através de métodos públicos controlados.

### 🧩 Organização dos Pacotes
br.edu.principal
Contém a classe principal responsável por executar os testes com as figuras.

br.edu.figurasgeometricasplanas
Contém as classes que implementam formas planas com seus atributos privados e métodos de acesso (getters e setters).

### 💡 Conceito Demonstrado
Encapsulamento:
As propriedades das figuras (como base, altura, raio, etc.) são mantidas privadas. O acesso e a alteração dessas informações ocorrem somente por meio de métodos públicos (get e set), evitando modificações indesejadas e garantindo integridade dos dados.


##  Diagrama de classe UML com Encapsulamento: 
![Image](https://github.com/user-attachments/assets/67e8093d-4134-48cb-acac-96ee56244a8c)


# 🧬 figurasGeometricas – Herança 
Este projeto demonstra o uso do princípio de herança, um dos pilares da Programação Orientada a Objetos (POO). Por meio da herança, classes específicas de figuras reutilizam atributos e métodos de uma estrutura base, promovendo reaproveitamento de código e organização hierárquica.

### 🧩 Organização dos Pacotes
br.edu.principal
Contém a classe principal responsável por executar o programa e testar as figuras.

br.edu.figurasgeometricasplanas
Inclui uma classe abstrata base para formas planas e suas subclasses concretas (como Quadrado, Triangulo, Circulo).

br.edu.figurasgeometricasespaciais
Contém uma estrutura semelhante, com herança aplicada para sólidos como Cubo, Esfera, Cilindro.

###💡 Conceito Demonstrado
Herança:
Classes genéricas como FormaPlana ou FormaEspacial servem como base para outras formas. As subclasses herdam atributos e comportamentos comuns, e podem implementar ou sobrescrever métodos conforme necessário.

## Diagrma de classe UML com Herança: 
![Image](https://github.com/user-attachments/assets/1e5863fe-6130-4094-af0c-be03bae40b92)
