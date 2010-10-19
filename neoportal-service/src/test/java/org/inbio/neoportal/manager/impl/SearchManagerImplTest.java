/*
 *  Copyright (C) 2010 INBio - Instituto Nacional de Biodiversidad, Costa Rica
 * 
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 * 
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 * 
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.inbio.neoportal.manager.impl;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.inbio.neoportal.service.dao.impl.DwCDAOImpl;
import java.util.Calendar;
import org.inbio.neoportal.service.entity.DarwinCore;
import org.inbio.neoportal.service.manager.SearchManager;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.*;

/**
 *
 * @author asanabria <asanabria@inbio.ac.cr>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:tests-context.xml"})
@TransactionConfiguration(transactionManager = "transactionManager",defaultRollback = false)
public class SearchManagerImplTest {

    @Autowired
    private SearchManager searchManagerImpl;

    @Autowired
    public  DwCDAOImpl dwcDAOImpl;

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
        DarwinCore dwc = new DarwinCore();
        dwc.setDatelastmodified(Calendar.getInstance().getTime());
        dwc.setInstitutioncode("INB");
        dwc.setCollectioncode("Artropoda");
        dwc.setBasisofrecord("specimen");

        if(dwcDAOImpl.findAll(DarwinCore.class).isEmpty()){

            dwc.setGlobaluniqueidentifier("INB:1");
            dwc.setScientificname("Inga vera");
            dwc.setCatalognumber("1");
            dwcDAOImpl.create(dwc);

            dwc.setGlobaluniqueidentifier("INB:2");
            dwc.setScientificname("Inga vera subsp. spuria");
            dwc.setCatalognumber("2");
            dwcDAOImpl.create(dwc);

            dwc.setGlobaluniqueidentifier("INB:3");
            dwc.setScientificname("Inga vera subsp. vera");
            dwc.setCatalognumber("3");
            dwcDAOImpl.create(dwc);

            dwc.setGlobaluniqueidentifier("INB:4");
            dwc.setScientificname("Inga vera");
            dwc.setCatalognumber("4");
            dwcDAOImpl.create(dwc);

            dwc.setGlobaluniqueidentifier("INB:5");
            dwc.setScientificname("Inga vera");
            dwc.setCatalognumber("5");
            dwcDAOImpl.create(dwc);
        }
    }

    @After
    public void tearDown() {
        searchManagerImpl = null;
    }

    /**
     * Test of fullPaginatedSearch method, of class SearchManagerImpl.
     */
    @Test
    public void testSpeciesPaginatedSearch() throws Exception {
        System.out.println("fullPaginatedSearch");
        String searchText = "Inga_vera";
        int offset = 0;
        int quantity = 20;
        Integer expResult = new Integer(3);
        List result = searchManagerImpl.speciesListPaginatedSearch(searchText, offset, quantity);
        assertEquals(expResult, new Integer(3));
    }

    /**
     * Test of fullPaginatedSearch method, of class SearchManagerImpl.
     */
    @Test
    public void testFullPaginatedSearch() throws Exception {
        System.out.println("fullPaginatedSearch");
        String searchText = "Inga_vera";
        int offset = 0;
        int quantity = 20;
        Integer expResult = new Integer(5);
        List result = searchManagerImpl.fullPaginatedSearch(searchText, offset, quantity);
        assertEquals(expResult, new Integer(5));
    }

    /**
     * Test of fullSearchCount method, of class SearchManagerImpl.
     */
    @Test
    public void testFullSearchCount() throws Exception {
        System.out.println("fullSearchCount");
        String searchText = "Inga";
        Integer expResult = new Integer(5);
        Integer result = searchManagerImpl.fullSearchCount(searchText);
        assertEquals(expResult, result);
    }
}