package sousuo.biz;

import java.util.List;

 


import sousuo.entity.Tcategory;
import sousuo.entity.Tcategorysecond;

 

 

public interface ICateService {

   List<Tcategory> queryAllCatergrys();
   List<Tcategorysecond> querySmallByBig(int bigId);
   void deleteSmallCate(int id); 
   List<Tcategorysecond> querySmallByCat(int smallId);
   List<Tcategory> queryAllCatergrys2();
}
