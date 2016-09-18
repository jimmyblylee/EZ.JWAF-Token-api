/**
 * Project Name : jwaf-token-api <br>
 * File Name : FuncTree.java <br>
 * Package Name : com.lee.jwaf.token <br>
 * Create Time : 2016-09-18 <br>
 * Create by : jimmyblylee@126.com <br>
 * Copyright © 2006, 2016, Jimmybly Lee. All rights reserved.
 */
package com.lee.jwaf.token;

import java.util.List;

/**
 * ClassName : FuncTree <br>
 * Description : api of Token Function with tree structure <br>
 * Create Time : 2016-09-18 <br>
 * Create by : jimmyblylee@126.com
 */
public interface FuncTree extends Func {

    /**
     * @return the parent
     */
    public Integer getParentId();

    /**
     * @param parentId the parentId to set
     */
    public void setParentId(Integer parentId);

    /**
     * @return the children
     */
    public List<FuncTree> getChildren();

    /**
     * @param children the children to set
     */
    public void setChildren(List<FuncTree> children);

    /**
     * @return the isRoot
     */
    public Boolean getIsRoot();

    /**
     * @param isRoot the isRoot to set
     */
    public void setIsRoot(Boolean isRoot);

    /**
     * @return the isLeaf
     */
    public Boolean getIsLeaf();

    /**
     * @param isLeaf the isLeaf to set
     */
    public void setIsLeaf(Boolean isLeaf);
}
