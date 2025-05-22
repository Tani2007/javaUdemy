public class InheritanceConcept {
    //? we wil study this inheritance Concept via Animal class.
    //!I made 3 private instance in Animal class type size weight and i inherit those using super() in dog class and in InheritanceMain i called doAnimalStuff mehtod which had arugument type of animal but i passed dog tye arguments in it.
    //! if i am passing animal type in my doAnimalStuff function then i am calling toString function then it will call toString function of Animal class but if i am passing dog type argument in my function and call toString function inside it then it will check that my dog class has that toSting function if it has then it will call that function if it doesn't have then it will call toString function of Animal type.
    //? Same if you create a function makeNoise() in Dog class then it doAnimal function won't call makeNoise of Animal it will call makeNoise of Dog.
    //todo this shows that class and methods both can be inherited.

}
