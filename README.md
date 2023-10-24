# BookStoreProject for CS3354 Dr. Lehr Fall 2023 Texas State University
App.java:  this contains the main method and code to "drive" the calls to rest of the project code

inventory: this contains a file that manages the 'inventory' of the products: books, stationary, pens and pencils
InventoryItem.java
InventoryMgnt.java
io: this contains a file that read a file inventory_items.txt that contains lines of new inventory items to add  
ItemEntry.java
pricing: this contains one file that represents  the 'pricing' of the products.
PricingInfo.java
product: this contains one file that describe the product in the inventory.   Currently it only as a name field.
ProductInfo.java
quantity: this contains one file that represents the quantity of an item
QuantityInfo.java
sales: this contains two files that 'make' sales and keeps track of them.
Sales.java: 
SalesCounter.java:
.gitignore: this is at the top level directory and tells Git to ignore certain files and directories when staging and committing.
inventory_items.txt: 
You will do the following for this project (Team members will do this individually and discuss). 

Change lines 28 - 33 in App.java to take the items specified in inventory_items.txt and add them to the inventory.  It is ok if your replacement code takes more lines than 28-33.
Create a HashMap in InventoryMgnt.java that uses the name of the product as the key and ProductInfo as value.  Create a public method getProductInfoMap() in InventoryMgnt.java that adds instances of key-value pairs <productInfo.getProductInfoName(), productInfo> to the HashMap and returns the HashMap.  You will call the new method from App.java to create a productInfoMap that you will use in the next step.  
Change lines 40 - 44 in App.java to print out the availability and pricing of every item in the Inventory. You can use an enhanced for loop that has this structure:
for(String product : productInfoMap.keySet()){} where productInfoMap is the hashmap you created from the call to the getProductInfoMap() method you created in InventoryMgnt.java
Change lines 46 - 55 in App.java so that it no longer uses bookItem, pencilItem, stationaryItem, etc.  Instead you will use strings like "Book," "Pencil," "Stationary," at least one item from inventory_items.txt and an item that doesn't exist in the inventory.  You will use the HashMap you created in (2) above, and the methods in inventory_mgnt.  Your code should gracefully handle the case where the item doesn't exist in the inventory (Exceptions might be useful here but there are other techniques). 
In InventoryMgnt.java, change the decrementQuantity method to throw an exception when newQuantity is negative.  You will then have to change code in other files to recognize (try-catch) the exception. 
In ItemEntry.java changes the readEntriesFromFile() method to throw an exception if a line in filename (in this case, inventory_items.txt) does not have exactly 3 parts. 
Explain your changes in App.java, InventoryMgnt.java and ItemEntry.java using Zoom and ChatGPT
You will record your explanation over Zoom and generate a transcript. 
You will begin with App.java and then describe what the rest of the code does.  
Please study this ChatGPT prompt NewChatGPT_Prompt.txt Download NewChatGPT_Prompt.txtto understand what your explanation must cover. 
You will have ChatGPT analyze your transcript:
Open a new chat in ChatGPT.  Do not re-use an existing chat sessions to do this exercise as it makes the ChatGPT results 'noisy.'
Copy and paste the prompt from the following file into ChatGPT and hit the enter/return key:
After ChatGPT responds and tells you it is waiting:
Copy and paste your code into one file.
Press Shift-Enter (hold down the shift key and hit the enter/return key)
Copy and paste the text from your Zoom transcript and hit enter
Copy ChatGPT's response and paste it into a text file named "project2_chatgpt_response_yournetid_1.txt" where "yournetid" is your NetID.
You may repeat steps 1 - 4 as often as you like and submit the two (or more) responses you prefer.  I would recommend choosing the first and last responses to see if there is improvement
Submitting Assignment:

Submit a URL of the Bitbucket Repo with your (and your team's) code.
Who is on your team. 
Submit the zoom video and transcript of you explaining the code.
Submit on ChatGPT evaluation of you explaining your code. 
