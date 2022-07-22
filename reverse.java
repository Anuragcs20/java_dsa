public void sort(){

   int i, j, k, tempKey, tempData ;
   Link current,next;
   int size = length();
   k = size ;
   for ( i = 0 ; i < size - 1 ; i++, k-- ) {
      current = first ;
      next = first.next ;
      for ( j = 1 ; j < k ; j++ ) {            
         if ( current.data > next.data ) {
            tempData = current.data ;
            current.data = next.data;
            next.data = tempData ;

            tempKey = current.key;
            current.key = next.key;
            next.key = tempKey;
         }
         current = current.next;
         next = next.next;                        
      }
   }
}