package ${packageName};

import org.nutz.dao.entity.annotation.*;
/** ${tableEntity.tableNote}
 * @author ${authorEntity.author}
 * @company ${authorEntity.company}
 * @date ${authorEntity.createTime}
 * @version ${authorEntity.version}
 */
@Table("${tableEntity.tableSqlName}")
public class ${tableEntity.tableClassName?cap_first} {
	<#list tableEntity.fields as fieldEntity>
	/** ${fieldEntity.fieldNote}*/
	@Column("${fieldEntity.fieldSqlName}")
    private ${fieldEntity.fieldClassType} ${fieldEntity.fieldClassName}; 
	</#list>
	
	<#list tableEntity.fields as fieldEntity>
    public ${fieldEntity.fieldClassType} get${fieldEntity.fieldClassName?cap_first}() {
		return ${fieldEntity.fieldClassName};
	}
	public void set${fieldEntity.fieldClassName?cap_first}(${fieldEntity.fieldClassType} ${fieldEntity.fieldClassName}) {
		this.${fieldEntity.fieldClassName} = ${fieldEntity.fieldClassName};
	}
	</#list>
	
	@Override
	public String toString() {
		return "${tableEntity.tableClassName?cap_first} ["+
		<#list tableEntity.fields as fieldEntity> 
		"${fieldEntity.fieldClassName} = " + ${fieldEntity.fieldClassName} + ", "+
		</#list>
		"]";
	}
}

