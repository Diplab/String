String
======
## Outline

- [前言](#前言)

- [字串類別](#字串類別)
	+ [String](#string)
 		* [String函式](#string函式)

	+ [StringBuilder](#stringbuilder)
		* [StringBuffer](#stringbuffer)
		* [使用時機](使用時機)
- [StringTokenizer](#stringyokenizer)
- [格式化輸出](#格式化輸出)
- [正規表示式](#正規表示式)


## 前言
字串是一種使用非常頻繁的資料型態。字串可以被視為一連串的字元所組合而成的資料型態。在「String」類別中擁有許多的方法可以被用來處理字串。
以下將介紹常使用的字串類別及其相關的工具。

##字串類別

###String
利用String類別建構出來的物件的內容是無法變動的(Immutable)，也就是說，一旦建立字串後，就無法改變其值，只能重新指定成新的字串值或另一個字串變數。

####String函式
由於String使用上得頻繁，請自行瀏覽SDK文件中關於「java.lang」套件的String類別的相關方法，常用的方法有：
![String.png](img/string.png)
```
public class StringEX {

	
	public static void main(String[] args) {
		String str = "A Dog ";
		System.out.println(str.length());                    //6
		System.out.println(str.concat("!"));                 //A dog !
		System.out.println(str.trim());                      //A dog
		System.out.println(str.indexOf("d"));                //2
		System.out.println(str.charAt(3));                   //o
		System.out.println(str.substring(2,5));              //dog
		System.out.println(str.replace("dog","cat"));        //A cat
		System.out.println(str.equalsIgnoreCase("A DOG "));  //true
		System.out.println(str.startsWith("A"));             //true
		System.out.println(str.endsWith("dog"));             //true
		System.out.println(str.toLowerCase());               //a dog
		System.out.println(str.toUpperCase());               //ADOG
		System.out.println(str);                             //A dog 
	}

}

```


###StringBuilder
- 最主要的用途在於字串的新增、刪除、修改等操作
- 使用'+'來串接字串，但'+'會產生一個新的String實例 
- 不建議使用'+'來進行字串的串接，建議先以StringBuilder串接字串
- 文字的串接必須要用append() 或 insert() 方法
- 減少垃圾量，提高效能
```
public class StringBuilderEx {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("A dog");
		System.out.println(sb.append("!"));
		System.out.println(sb.insert(2, "barking "));
		
		int beginIndex = sb.indexOf("bark");
		int endIndex = sb.indexOf("!");
		System.out.println(sb.replace(beginIndex, endIndex, "meowing cat"));
		
		beginIndex = sb.indexOf("meow");
		endIndex = sb.indexOf("cat");
		System.out.println(sb.delete(beginIndex, endIndex));
		
		System.out.println(sb.substring(2, sb.length()));

	}

}
```

####StringBuffer
StringBuilder隨著Java SE5時問世。在此之前，Java適用的是StringBuffer，他保證跨執行緒的安全性(請參見並行性一章)，所使用代價較高。

####使用時機
StringBuilder 與 StringBuffer 的使用時機
- 非多執行緒環境 → StringBuilder 具較高執行效率
  + 因為StringBuilder不會處理同步問題
- 多執行緒環境 → StringBuffer 確定可以正常運作

##格式化輸出

##正規表示式

##Scanner類別
- 將掃瞄進來的文字做分割，預設使用空白字元分割
- 可使用正規運算式，將符合格式的文字當作分割依據。
- 並可搭配hasNext()與next()、nextInt等方法將值取出。


###StringTokenizer
- 可以將一個長字串分解成多個子字串
- 已被Scanner取代







