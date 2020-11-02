import java.util.*

data class Car(var name : String,var lisence : Int)

fun main(){


    /*******************************************************************************************************************
     *      Important points about Kotlin List & MutableList
     * 1. List is read-only (immutable), you cannot add or update items in the original list.
     * 2. MutableList inherits List and supports read/write access, you can add, update or remove items.
     * 3. List & MutableList are ordered collections in which the insertion order of the items is maintained.
     * 4. List & MutableList allows duplicates and null values
     ******************************************************************************************************************/



    /*******************************************************************************************************************
     *      Create List, MutableList in Kotlin
     * 1. We create a new empty List, MutableList using mutableListOf() method.
     * We can specify the type of items in the List (Int, String…). For different data types,
     * or for object types, we’re gonna use Any.
     ******************************************************************************************************************/

//    val intList: List<Int> = listOf(1,2,3,4)
//    val stringList : List<String> = listOf("java","kotlin")
//    val anyList : List<Any> = listOf(1,2,3,"java","kotlin",1.2,Car("lambo",123))
//
//
//    val intMutableList: MutableList<Int> = mutableListOf(1,2,3,4)
//    val stringMutablelist : MutableList<String> = mutableListOf()
//    val longMutableList : MutableList<Double> = mutableListOf(2.4,4.2,3.3)
//    val anyMutablelist : MutableList<Any> = mutableListOf(1,2,"lambo",2020,2.3)




    /*******************************************************************************************************************
     *      Kotlin Initialize List, MutableList with values
     * 1. initialize List using listOf() and listOfNotNull() functions.
     * 2. initialize MutableList using mutableListOf().
     * 3. create new List, MutableList using Initializer functions.
     * 4. create new List, MutableList from another List, MutableList with the same elements using toList(),
     * toMutableList() functions.
     ******************************************************************************************************************/

//    val intList : List<Int> = listOf(1,2,3)
//    val intList2 : MutableList<Int> = intList.toMutableList()
//    intList2.add(4)
//    println(intList2)






    /*******************************************************************************************************************
     *          Add items to List in Kotlin
     * 1. add item to list using add() method.
     * 2. insert item into the list at the specified index.
     * 3. add item to list using plus (+) operator.
     ******************************************************************************************************************/

//    val anyMutableList = mutableListOf<Any>()
//    anyMutableList.add("tricky solution")
//    println(anyMutableList)
//    anyMutableList.add(0," I added this with the help of add function")
//    println(anyMutableList)
//    anyMutableList += "kotlin"
//    anyMutableList.add(4)
//    println(anyMutableList)
//    anyMutableList += 6
//    println(anyMutableList)



    /*******************************************************************************************************************
     *          Add list to mutable list in Kotlin
     * 1. using addAll() method
     * 2. at specified index.
     * 3. using plus (+) operator.
     ******************************************************************************************************************/

//    val list = mutableListOf(1, 2)
//    val list1 : List<Int> = listOf(5, 6)
//    list.addAll(list1)
//    list.addAll(0, listOf(9,10))
//    list += listOf(78,67)
//    println(list)




    /*******************************************************************************************************************
     * Kotlin combine multiple lists
     * 1. plus() method
     * 2. plus (+) operator
     * 3. addAll() method
     * 4. listOf function, toTypedArray() with spread operator.
     ******************************************************************************************************************/

//    val list1 = listOf(1, 2)
//    val list2 = listOf(3, 4)
//    val list3 = listOf(5, 6)
//
//    val combinedList = list1.plus(list2).plus(list3)
//    println(combinedList)
//    val combinedList2 = list1 + list2 + list3
//    println(combinedList2)
//
//    val combinedList3 = list1.toMutableList()
//    combinedList3.addAll(list2)
//    combinedList3.addAll(list3)
//    println(combinedList3)





    /*******************************************************************************************************************
     *          Access items from List in Kotlin
     *  1. find the size of a List using .size getter or count() method.
     *  2. check if a List is empty or not using isEmpty() or isNotEmpty().
     *  3. access the item at specified index in a List using operator [], get(), getOrElse(), getOrNull()
     *******************************************************************************************************************/

//    val nums = listOf(1, 2, 3, 4, 5,2,3,2,6,5,7,4,3,3,5,5,6,7,8,9,3)
//    val emptyList :  List<Int> = listOf()
//
//    if (nums.isEmpty()){
//        println("list is empty")
//    }
//    else{
//        println(nums.getOrNull(22))
//    }



    /*******************************************************************************************************************
     * 1. get subList of the List from specified index to another index (exclusive) using subList() method.
     * 2. get subList of the List by specifying the range using slice() method.
     ******************************************************************************************************************/


//    val nums = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8)
//    println(nums.subList(2,5))
//    // 0 -> 0
//    println(nums.slice(2..5))
//





    /*******************************************************************************************************************
     *      Kotlin List take
     *      1. take the first or last items of a List using take() or takeLast() method.
     *      2. take the first items of a List satisfying the given condition using takeWhile() method.
     *      3. take sublist that contains the last items of a List satisfying the given condition using
     *      takeLastWhile() method.
     ******************************************************************************************************************/

//    val nums = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8)
//    println(nums.take(3))
//    println(nums.takeWhile { element -> element <  7})
//    println(nums.takeLast(3))
//    println(nums.takeLastWhile { it>4 })









    /*******************************************************************************************************************
     *      Kotlin List drop
     * 1. get subList that contains all items by dropping first items or last items using drop() or dropLast()
     * 2. get subList containing all items by dropping first items that satisfy a given condition using dropWhile()
     * 3. get subList containing all items by dropping last items that satisfy a given condition using dropLastWhile()
     ******************************************************************************************************************/


//    val nums = listOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
//    println(nums.drop(3))
//    println(nums.dropWhile { it < 5 })
//    println(nums.dropLast(1))
//    println(nums.dropLastWhile { it>5 })





    /*******************************************************************************************************************
     *      Kotlin Update/Replace item in List
     * 1. update/replace item in mutable List at specified index using set() method or operator []
     * 2. replace all items in mutable List with given value using fill() method.
     * 3. replace each item in the list with a result of a function using replaceAll() method.
     ******************************************************************************************************************/

//    val list : MutableList<Any> = mutableListOf(0, 1, 2, 3)
//    val names = mutableListOf("jan","ahmad","kabir")
    //list.set(3,"Three")
    //
    // list.fill("something")
//    names.replaceAll { item -> item.toString().capitalize() + "@gmail.com" }
//    println(names)







    /*******************************************************************************************************************
     * Kotlin remove items from List
     * 1. remove the item at a given index in a List | removeAt(index)
     * 2. remove first element from List or last element from List in Kotlin | removeAt()
     * 3. remove the first occurrence of item from a List by its value | remove(value)
     * 4. remove all items from the List that match a given condition or another List | removeAll()
     * 5. remove all the items | clear()
     * 6. remove all items from the List that are in another List using minus (-) operator
     */

//    val nums = mutableListOf(-3, -2, 4, -1, 0, 1, 2, 3, 4, 2, 5, 6, 5, 8)
//    nums.removeAt(0)
//    nums -= listOf(1,2,5,8,9,10)
//    nums.removeAll({it<0})
//    nums.clear()
//    println(nums)



    /*******************************************************************************************************************
     *      Iterate over List in Kotlin
     * 1. forEach() method.
     * 2. simple for loop.
     * 3. ListIterator and a while loop.
     * 4. for loop with item index
     * 5. forEachIndexed() that gives us index and value in each iteration.
     ******************************************************************************************************************/







    /*******************************************************************************************************************
     *      Reverse List in Kotlin
     * 1. get a new List with revered order using reversed() method.
     * 2. get a reversed read-only list of the original List as a reference using asReversed() method.
     *    If we update item in original list, the reversed list will be changed too.
     ******************************************************************************************************************/


    /*******************************************************************************************************************
     *          Kotlin find object in List
     * 1. check if a List contains an object or not | contains() or in
     * 2. check if a List contains all given objects or not | containsAll()
     * 3. find the index of the first/last occurrence of an object | indexOf() / lastIndexOf()
     * 4. find the index of the first/last occurrence of an object that matches a condition |
     *      indexOfFirst() / indexOfLast()
     * 5. find the first/last item in the list that matches a condition | find() / findLast()
     ******************************************************************************************************************/


    /*******************************************************************************************************************
     *          Create arrays
     * 1. Declare an array of strings using arrayOf. Use the java.util.Arrays.toString() array utility to print it out.
     * 2. An array declared with arrayOf doesn't have a type associated with the elements, so you can mix types,
     *    which is helpful. Declare an array with different types.
     * 3. You can also declare arrays with one type for all the elements. Declare an array of integers using
     *    intArrayOf(). There are corresponding builders, or instantiation functions, for arrays of other types.
     * 4. Combine two arrays with the + operator.
     * 5. Try out different combinations of nested arrays and lists.
     * 6. One nice feature of Kotlin is that you can initialize arrays with code instead of initializing them to 0.
     *      Try this example:
     *
     ******************************************************************************************************************/



}
