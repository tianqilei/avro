package avro;

/*-
 *
 *  This file is part of Oracle NoSQL Database
 *  Copyright (C) 2011, 2014 Oracle and/or its affiliates.  All rights reserved.
 *
 *  Oracle NoSQL Database is free software: you can redistribute it and/or
 *  modify it under the terms of the GNU Affero General Public License
 *  as published by the Free Software Foundation, version 3.
 *
 *  Oracle NoSQL Database is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Affero General Public License for more details.
 *
 *  You should have received a copy of the GNU Affero General Public
 *  License in the LICENSE file along with Oracle NoSQL Database.  If not,
 *  see <http://www.gnu.org/licenses/>.
 *
 *  An active Oracle commercial licensing agreement for this product
 *  supercedes this license.
 *
 *  For more information please contact:
 *
 *  Vice President Legal, Development
 *  Oracle America, Inc.
 *  5OP-10
 *  500 Oracle Parkway
 *  Redwood Shores, CA 94065
 *
 *  or
 *
 *  berkeleydb-info_us@oracle.com
 *
 *  [This line intentionally left blank.]
 *  [This line intentionally left blank.]
 *  [This line intentionally left blank.]
 *  [This line intentionally left blank.]
 *  [This line intentionally left blank.]
 *  [This line intentionally left blank.]
 *  EOF
 *
 */

import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.specific.SpecificRecord;

import avro.Usr;
import oracle.kv.KVStore;
import oracle.kv.KVStoreConfig;
import oracle.kv.KVStoreFactory;
import oracle.kv.Key;
import oracle.kv.Value;
import oracle.kv.ValueVersion;
import oracle.kv.avro.AvroCatalog;
import oracle.kv.avro.GenericAvroBinding;
import oracle.kv.avro.SpecificAvroBinding;

/*
 * create specific binding by using command : ant
 * put the schema and generate-specific.xml in the same directory 
 * and run : 
 * ant -f generate-specific.xml
 * then the new java file appear at ../avro
 * */
public class Conn2OracleNosql {

	private final KVStore store;
	private static final String HOST_NAME = "172.20.10.7";
	private static final String HOST_PORT = "5000";

	/**
	 * Runs the HelloBigDataWorld command line program.
	 * 
	 * @throws IOException
	 */
	public static void main(String args[]) throws IOException {
		try {
			Conn2OracleNosql example = new Conn2OracleNosql();
			example.runExample();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Parses command line args and opens the KVStore.
	 * 
	 * @throws IOException
	 */
	public Conn2OracleNosql() throws IOException {

		String storeName = "kvstore";
		String hostName = HOST_NAME;
		String hostPort = HOST_PORT;

		store = KVStoreFactory.getStore(new KVStoreConfig(storeName, hostName
				+ ":" + hostPort));

		/*
		 * final Schema.Parser parserShop = new Schema.Parser();
		 * parserShop.parse(new File(
		 * "/Users/tianqilei/Documents/workspace/stage_m1/src/conn2database/shop.avsc"
		 * )); final Schema shopSchema = parserShop.getTypes().get("avro.shop");
		 * final AvroCatalog catalog = store.getAvroCatalog(); final
		 * GenericAvroBinding binding = catalog .getGenericBinding(shopSchema);
		 * 
		 * final GenericRecord shop = new GenericData.Record(shopSchema);
		 * shop.put("shopName", "test"); shop.put("url", "http://A.B.C/shop0");
		 * 
		 * store.put(Key.createKey("shop0"), binding.toValue(shop));
		 * 
		 * final ValueVersion vv = store.get(Key.createKey("shop0")); final
		 * GenericRecord member; String name = null; if (vv != null) { member =
		 * binding.toObject(vv.getValue()); name = member.get("url").toString();
		 * } System.out.println(name);
		 */
		AvroCatalog catalogUsr;
		SpecificAvroBinding<SpecificRecord> bindingUsr;
		catalogUsr = store.getAvroCatalog();
		bindingUsr = catalogUsr.getSpecificMultiBinding();
		
//		catalogUsr = store.getAvroCatalog();
//		bindingUsr = catalogUsr.getSpecificBinding(avro.Usr.class);
		avro.Usr usr = new Usr();
		usr.setAge(15);
		usr.setName("test");
		usr.setSex("f");

		ArrayList<String> list = new ArrayList<String>();
		list.add("111");
		list.add("222");
		usr.setAddress(list);
		usr.setFriendship(list);
		usr.setVisit(list);
		store.put(Key.createKey("usr0"), bindingUsr.toValue(usr));
		ValueVersion vv = store.get(Key.createKey("usr0"));
		SpecificRecord u = bindingUsr.toObject(vv.getValue());
		Usr tUsr = (Usr) u;
		System.out.println(tUsr.getName());
	}

	public GenericAvroBinding getBinding(String name) throws IOException {
		Schema.Parser parser = new Schema.Parser();
		parser.parse(new File(
				"/Users/tianqilei/Documents/workspace/stage_m1/src/conn2database/"
						+ name + ".avsc"));
		Schema shopSchema = parser.getTypes().get("avro.shop");
		AvroCatalog catalog = store.getAvroCatalog();
		return catalog.getGenericBinding(shopSchema);
	}

	public void usage(String message) {
		System.out.println("\n" + message + "\n");
		System.out.println("usage: " + getClass().getName());
		System.out.println("\t-store <instance name> (default: kvstore) "
				+ "-host <host name> (default: localhost) "
				+ "-port <port number> (default: 5000)");
		System.exit(1);
	}

	/**
	 * Performs example operations and closes the KVStore.
	 */
	void runExample() {

		final String keyString = "Hello";
		final String valueString = "Big Data World!";

		store.put(Key.createKey(keyString),
				Value.createValue(valueString.getBytes()));

		final ValueVersion valueVersion = store.get(Key.createKey(keyString));
		System.out.println(keyString + " "
				+ new String(valueVersion.getValue().getValue()));

		store.close();
	}
}
