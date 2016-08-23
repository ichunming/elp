/**
 * Block 模块管理类
 * 2015/10/20 chunming
 */
package com.elp.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.elp.consts.AppConst;
import com.elp.entity.Block;
import com.elp.service.TagService;
import com.elp.service.UserService;

public class BlockManager {
	
	// 模块Map
	private Map<String, Block> blockMap;
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	// set blockMap
	public void setBlockMap(Map<String, Block> blockMap) {
		this.blockMap = blockMap;
	}
	
	// 取得 用户列表 模块
	public Block getBlockUserlist() {
		return blockMap != null?blockMap.get(AppConst.BLOCK_USERLIST):null;
	}
	
	// 取得 标签云库 模块
	public Block getBlockTags() {
		return blockMap != null?blockMap.get(AppConst.BLOCK_TAGS):null;
	}

	// init
	public void init() {
    	// load block
		XMLUtil xmlUtil = new XMLUtil();
    	List<Block> blockList = xmlUtil.loadXML(this.getClass().getClassLoader().getResource("block.xml").getPath(), Block.class);
    	if (null != blockList) {
    		blockMap = new HashMap<String, Block>();
        	for (Block block : blockList) {
        		// 填充内容
        		fillBlock(block);
        		blockMap.put(block.getType(), block);
        	}
    	}
	}
    
	// update
	public void update() {
		for(Block block : blockMap.values()) {
			fillBlock(block);
		}
	}
	
    /**
     * 填充block内容
     */
    private void fillBlock(Block block) {
    	if(AppConst.BLOCK_USERLIST.equals(block.getType())) {
    		// 用户列表模块 TODO
    		UserService userService = SpringContextUtil.getBean(UserService.class);
    		// TODO
    		logger.debug("用户列表模块加载完毕！");
    	}else if(AppConst.BLOCK_TAGS.equals(block.getType())) {
    		// 标签库模块 TODO
    		TagService tagService = SpringContextUtil.getBean(TagService.class);
    		// TODO
    		logger.debug("标签库模块加载完毕！");
    	}
    	// 添加模块时做同样的处理
    }
 
}
