
// // SUPER EXAMPLE
// // public class Animal {
// //     public void animalSound() {
// //         System.out.println("The animal makes sound");
// //     }

// //     static class Dog extends Animal {
// //         public void animalSound() {
// //             super.animalSound();
// //             System.out.println("The dog barks");
// //         }
// //     }

// //     static class Cat extends Animal {
// //         public void animalSound() {
// //             super.animalSound();
// //             System.out.println("The cat meows");
// //         }
// //     }

// //     public static void main(String[] args) {
// //         Animal myAnimal = new Animal();
// //         Animal myDog = new Dog();
// //         Animal myCat = new Cat();
// //         myDog.animalSound();
// //         myCat.animalSound();
// //     }
// // }

// //Polymorphism Example
// class MainAnimal {
//     public void animalSound() {
//         System.out.println("The animal makes sound");
//     }
// }

// class Dog extends MainAnimal {
//     public void animalSound() {
//         super.animalSound();
//         System.out.println("The dog barks");
//     }
// }

// class Cat extends MainAnimal {
//     public void animalSound() {
//         super.animalSound();
//         System.out.println("The cat meows");
//     }
// }

// public class Animal {
//     public static void main(String[] args) {
//         MainAnimal myDog = new Dog();
//         MainAnimal myCat = new Cat();
//         MainAnimal myAnimal = new MainAnimal();
//         myDog.animalSound();
//         myCat.animalSound();
//         myAnimal.animalSound();
//     }
// }