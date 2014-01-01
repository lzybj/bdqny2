/*  declare
    v_num   number(8);
    v_mystr varchar2(20) := '老郑';
    v_now   date := sysdate;
  begin
    v_num := 10;
    if (v_num > 5) then
      begin
        dbms_output.put_line('大于5');
        dbms_output.put_line('它的值为10');
      end;
    end if;
    if (v_num > 6) then
      dbms_output.put_line('大于6');
    else
      dbms_output.put_line('小于6');
    end if;
    dbms_output.put_line('第一个plsql块');
    dbms_output.put_line(v_num);
    dbms_output.put_line(v_mystr);
    dbms_output.put_line(to_char(v_now, 'yyyy-mm-dd hh24:mi:ss'));
  end;*/
  
  
/*  declare
  v_num   number(8) := 0;
  v_usid  number(8);
  v_uname varchar2(50);
  v_upwd  varchar2(50);
  begin
  select count(*) into v_num from tbl_users where uname = '老郑';
  if (v_num > 0) then
    begin
      dbms_output.put_line('此用户存在！');
      select usid, uname, upwd
        into v_usid, v_uname, v_upwd
        from tbl_users
       where uname = '老郑';
      dbms_output.put_line(v_usid || ',' || v_uname || ',' || v_upwd);
    end;
  else
    dbms_output.put_line('此用户不存在！');
  end if;
  end;*/

/*declare
  v_my  char(4) := 'F';
  v_str varchar2(50);
begin
  case v_my
    when 'A' then
      v_str := '挺好的';
    when 'B' then
      v_str := '一般';
    else
      v_str := '不好';
  end case;
  dbms_output.put_line(v_str);
end;*/

/*declare
  v_num number(8) := 1;
begin
  loop
    dbms_output.put_line(v_num);
    v_num := v_num + 1;
    if (v_num > 10) then
      exit; ---退出
    end if;
  end loop;
end;*/

/*declare
  v_num number(8) := 10;
begin
  while (v_num > 0) loop
    dbms_output.put_line(v_num);
    v_num := v_num - 1;
  end loop;
end;*/

/*declare
  v_num number(8);
begin
  for v_num in 0 .. 5 loop
  
    dbms_output.put_line(v_num);
  end loop;
end;*/

/*declare
  v_sum number(8) := 0;
  v_i   number(8);
begin
  for v_i in 1 .. 100 loop
    v_sum := v_sum + v_i;
  end loop;
  dbms_output.put_line(v_sum);
end;*/

/*declare
  v_num   number(8) := 0;
  v_usid  number(8);
  v_uname varchar2(20);
  v_upwd  varchar2(50);
begin
  select count(*) into v_num from tbl_users where uname = '老郑';
  if (v_num > 0) then
    select usid, uname, upwd
      into v_usid, v_uname, v_upwd
      from tbl_users
     where uname = '老郑';
    insert into tmp_users values (v_usid, v_uname, v_upwd);
  end if;
end;*/

/*declare
  v_num number(8) := 3;
  v_str varchar2(20);
begin
  case v_num
    when 0 then
      v_str := '星期日';
    when 1 then
      v_str := '星期一';
    when 2 then
      v_str := '星期二';
    when 3 then
      v_str := '星期三';
    when 4 then
      v_str := '星期四';
    when 5 then
      v_str := '星期五';
    when 6 then
      v_str := '星期六';
    else
      v_str := '对不起，格式错误！';
  end case;
  dbms_output.put_line(v_str);
end;*/

/*declare
  v_uname varchar2(20) := 'jinxing';
  v_upwd  varchar2(20) := '123456';
  v_sql   varchar2(100);
begin
  v_sql := 'insert into tbl_users(usid,uname,upwd)values(SEQ_TBL_USERS.nextval,:1,:2)';
  execute immediate v_sql
    using v_uname, v_upwd;
end;

select * from tbl_users*/

/*declare
  v_usid  number(8) := 0;
  v_uname varchar2(20) := '孙悟空';
  v_upwd  varchar2(20) := '大闹天宫';
  v_sql   varchar2(200);
begin
  v_sql := 'insert into tbl_users(usid,uname,upwd)values(SEQ_TBL_USERS.nextval,:1,:2) returning usid,uname,upwd into :3,:4,:5';
  execute immediate v_sql
    using v_uname, v_upwd
    returning into v_usid, v_uname, v_upwd;
  dbms_output.put_line(v_usid || ',' || v_uname || ',' || v_upwd);
end;

declare
  v_newupwd  varchar2(20) := '新大闹天宫';
  v_uname    varchar2(20) := '孙悟空';
  v_sql      varchar2(200);
  v_rs_uname varchar2(20);
  v_rs_upwd  varchar2(50);
begin
  v_sql := 'update tbl_users set upwd = :1 where uname= :2 returning uname,upwd into :3,:4';
  execute immediate v_sql
    using v_newupwd, v_uname
    returning into v_rs_uname,v_rs_upwd;
  dbms_output.put_line(v_rs_uname || ',' || v_rs_upwd);
end;*/

/*declare
  v_num number(8);
  v_rs_upwd varchar2(50);
  v_myexception exception;
  v_myexception2 exception;
begin
  select count(*) into v_num from tbl_users where uname = '孙悟空';
  if (v_num > 0) then
    raise v_myexception;
  end if;
  select upwd into v_rs_upwd from tbl_users where uname = '新孙悟空';
  if(v_rs_upwd = '大闹天宫') then
    raise v_myexception2;
  end if;
  insert into tbl_users
    (usid, uname, upwd)
  values
    (seq_tbl_users.nextval, '孙悟空', '新大闹天空');

exception
  when v_myexception then
    dbms_output.put_line('对不起，该用户存在！');
  when v_myexception2 then
    dbms_output.put_line('对不起，这个密码是旧密码');
end;
*/

declare
  v_num  number(8) := 10;
  v_num2 number(8) := 0;
  v_myexception exception;
begin
  if (v_num2 = 0) then
    raise v_myexception;
  end if;
  dbms_output.put_line(v_num / v_num2);
exception
  when v_myexception then
    dbms_output.put_line('对不起，除数不能为零!');
end;