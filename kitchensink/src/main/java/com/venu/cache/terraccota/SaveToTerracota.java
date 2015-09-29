package com.venu.cache.terraccota;

/*import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;
import net.sf.ehcache.config.CacheConfiguration;
import net.sf.ehcache.config.Configuration;
import net.sf.ehcache.config.TerracottaClientConfiguration;
import net.sf.ehcache.config.TerracottaConfiguration;*/

public class SaveToTerracota {

	/*public static void main(String[] args) {
		try{
			Configuration configuration = new Configuration()
			.terracotta(new TerracottaClientConfiguration().url("localhost:9510"))
			.defaultCache(new CacheConfiguration("defaultCache", 99999999))
			.cache(new CacheConfiguration("example", 99999999)
			.timeToIdleSeconds(5)
			.timeToLiveSeconds(120)
			.name("tinv")
			.terracotta(new TerracottaConfiguration()));
			CacheManager manager = new CacheManager(configuration);
			

			
			
			manager.addCacheIfAbsent("tinvCache");
			Cache dataStore = manager.getCache("tinvCache");
				
			Element el = new Element("key", "val");
			
			dataStore.put(el);
			
			System.out.println("put succesful");
			Long i=0L;

			 
			}catch(Exception e){
				
				e.printStackTrace();
			}

	}*/

}
